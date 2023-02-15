package com.redditclone.exception;

/**
 *
 * @author TEGA
 */
public class RedditCloneException extends RuntimeException{
    
    public RedditCloneException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public RedditCloneException(String exMessage) {
        super(exMessage);
    }
    
}
