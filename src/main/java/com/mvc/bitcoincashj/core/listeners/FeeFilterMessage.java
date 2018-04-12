package com.mvc.bitcoincashj.core.listeners;

import com.mvc.bitcoincashj.core.EmptyMessage;
import com.mvc.bitcoincashj.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
public class FeeFilterMessage extends EmptyMessage{
    public FeeFilterMessage(NetworkParameters params){
        super(params);
    }
}
