package com.redditclone.model;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

/**
 *
 * @author TEGA
 */
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    
    private String postName;
    
    @Nullable
    private String url;
    
    @Nullable
    @Lob
    private String description;
    
    @Builder.Default
    private Integer voteCount = 0;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private Users user;
    
    private Instant createdDate;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subreddit_id", referencedColumnName = "id")
    private Subreddit subreddit;
    
}
