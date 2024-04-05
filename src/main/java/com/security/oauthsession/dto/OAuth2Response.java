package com.security.oauthsession.dto;

public interface OAuth2Response {

    //제공자 이름(naver, google 등)
    String getProvider();

    //제공자에서 각각의 유저에 대하여 번호를 부여
    String getProviderId();

    //사용자가 설정한 메일, 이름
    String getEmail();

    String getName();
}
