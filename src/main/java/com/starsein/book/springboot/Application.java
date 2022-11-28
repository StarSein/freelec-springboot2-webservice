package com.starsein.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication  // 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동 설정
                        // 여기서부터 설정을 읽어가므로 이 클래스는 항상 프로젝트의 최상단에 위치
public class Application {  // 이 프로젝트의 메인 클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 내장 WAS 실행 => 항상 서버에 Tomcat을 설치할 필요 X, 스프링 부트로 만들어진 Jar 파일로 실행하면 됨
                                                        // 권장됨. 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있기 때문
                                                        // 외장 WAS를 쓴다고 하면 모든 서버는 WAS의 종류와 버전, 설정을 일치시켜야 함
    }
}
