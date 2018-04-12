package com.mvc.bitcoincashj.core.listeners;

import com.mvc.bitcoincashj.core.EmptyMessage;
import com.mvc.bitcoincashj.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
public class SendHeadersMessage extends EmptyMessage{
    public SendHeadersMessage(NetworkParameters params){
        super(params);
    }
}
