package com.shinemo.mpush.core.handler;

import com.shinemo.mpush.api.Request;
import com.shinemo.mpush.api.protocol.Packet;
import com.shinemo.mpush.core.message.LoginMessage;

/**
 * Created by ohun on 2015/12/22.
 */
public class LoginHandler extends BaseMessageHandler<LoginMessage> {
    @Override
    public LoginMessage decodeBody(byte[] body) {
        return new LoginMessage();
    }

    @Override
    public void handle(LoginMessage o, Request request) {
        request.getResponse().send("login success".getBytes());
    }
}