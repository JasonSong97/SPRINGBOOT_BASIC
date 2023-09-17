# 스프링 부트 3로 백엔드 입문하기

## 배포된 사이트

[My Blog](http://springboot-developer-env.eba-bdsxf3r2.ap-northeast-2.elasticbeanstalk.com/login)

## 배우는 기술

- FrontEnd
  - 템플릿 엔진
  - thymeleaf
  - javascript
  - html

- BackEnd
  - `SpringBoot`
    - Spring
    - IoC
    - Bean
  - `Spring Security`
    - Stateful Server  
    - Authentication
    - Authorization
    - Spring Security
      - 세션 기반 인증 방식
  - `JPA`
    - ORM
    - Hibernate
    - Spring Data Jpa
  - `OAuth2.0`
    - 용어
      - 리소스 오너
        - 리소스 오너 정보를 가지고 오는 4가지 방법
          - authorization code grant type : 권한 부여 코드 승인 타입(중요, 채택)
            - 권한요청
              - client_id
              - redirect_uri
              - response_type
              - scope
            - 데이터 접근용 권한 부여
              - 최초 1회
            - 인증코드 제공
            - 액세스 토큰 응답
              - client_secret
              - grant_type
            - 액세스 토큰으로 API 응답 & 반환
          - client credentials grant : 클라이언트 자격증명 승인 타입(중요)
          - implicit grant type : 암시적 승인 타입
          - resource owner password credentials : 리소스 소유자 암호 자격증명 승인 타입
      - 리소스 서버
      - 인증 서버
      - 클라이언트 애플리케이션
    - Cookie
      - 액세스 토큰
  - `JWT`
    - Stateless Server
    - 토큰 기반 인증 방식
    - Filter
    - SecurityContext
      - Thread Local 
      - SecurityContestHolder
    - Refresh Token
  - `JUnit Test`
    - AssertJ
    - Assertion
  - AWS
  - 깃허브 액션을 통한 CI/CD

## 백엔드 독학 일지

### 0. 개발환경 구축하기

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-1-Build-System-gradle%EA%B3%BC-maven%EC%B0%A8%EC%9D%B4)

### 1. 자바 백엔드 개발자가 알아두면 좋은 지식

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-1%EC%9E%A5-%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%97%94%EB%93%9C-%EA%B0%9C%EB%B0%9C%EC%9E%90%EA%B0%80-%EC%95%8C%EC%95%84%EB%91%90%EB%A9%B4-%EC%A2%8B%EC%9D%80-%EC%A7%80%EC%8B%9D)

### 2. 스프링 부트 3 시작하기

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-2%EC%9E%A5-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-3-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0)

### 3. 스프링 부트 3 구조 이해하기

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-3%EC%9E%A5-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-3-%EA%B5%AC%EC%A1%B0-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0)

### 4. 스프링 부트 3와 테스트

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-4%EC%9E%A5-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-3%EC%99%80-%ED%85%8C%EC%8A%A4%ED%8A%B8)

### 5. 데이터베이스 조작이 편해지는 ORM

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-5%EC%9E%A5-%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4%EC%99%80-%EC%A1%B0%EC%9E%91%EC%9D%B8-%ED%8E%B8%ED%95%B4%EC%A7%80%EB%8A%94-ORM)

### 6. 블로그 기획하고 API 만들기

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-6%EC%9E%A5-%EB%B8%94%EB%A1%9C%EA%B7%B8-%EA%B8%B0%ED%9A%8D%ED%95%98%EA%B3%A0-API-%EB%A7%8C%EB%93%A4%EA%B8%B0)

### 7. 블로그 화면 구성하기

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-7%EC%9E%A5-%EB%B8%94%EB%A1%9C%EA%B7%B8-%ED%99%94%EB%A9%B4-%EA%B5%AC%EC%84%B1%ED%95%98%EA%B8%B0)

### 8. 스프링 시큐리티로 로그인/로그아웃, 회원가입 구현하기

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-8%EC%9E%A5-%EC%8A%A4%ED%94%84%EB%A7%81-%EC%8B%9C%ED%81%90%EB%A6%AC%ED%8B%B0%EB%A1%9C-%EB%A1%9C%EA%B7%B8%EC%9D%B8%EB%A1%9C%EA%B7%B8%EC%95%84%EC%9B%83-%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0)

### 9. JWT로 로그인/로그아웃 구현하기

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-9%EC%9E%A5-JWT%EB%A1%9C-%EB%A1%9C%EA%B7%B8%EC%9D%B8%EB%A1%9C%EA%B7%B8%EC%95%84%EC%9B%83-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0)

### 10. OAuth2로 로그인/로그아웃 구현하기

[해당 챕터에서 알게된 내용 1](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-10%EC%9E%A5-OAuth2%EB%A1%9C-%EB%A1%9C%EA%B7%B8%EC%9D%B8%EB%A1%9C%EA%B7%B8%EC%95%84%EC%9B%83-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-a)

[해당 챕터에서 알게된 내용 2](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-10%EC%9E%A5-OAuth2%EB%A1%9C-%EB%A1%9C%EA%B7%B8%EC%9D%B8%EB%A1%9C%EA%B7%B8%EC%95%84%EC%9B%83-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-b)

### 11. AWS에 프로젝트 배포하기

[해당 챕터에서 알게된 내용 1](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-11%EC%9E%A5-AWS%EC%97%90-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%B0%B0%ED%8F%AC%ED%95%98%EA%B8%B0-a)
[해당 챕터에서 알게된 내용 2](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-11%EC%9E%A5-AWS%EC%97%90-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%B0%B0%ED%8F%AC%ED%95%98%EA%B8%B0-b)

### 12. CI/CD 도입하기(끝!)

[해당 챕터에서 알게된 내용](https://velog.io/@jaegeunsong_1997/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EB%8F%85%ED%95%99-12%EC%9E%A5-CICD-%EB%8F%84%EC%9E%85%ED%95%98%EA%B8%B0)

#### 출처 및 참고

[신선영 백엔드 개발자님의 스프링부트 3 백엔드 개발자 되기 자바편](https://github.com/shinsunyoung/springboot-developer)

[신선영 개발자님 소스코드](https://github.com/shinsunyoung/springboot-developer) 
