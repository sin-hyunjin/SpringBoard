# SpringBoard

---

## 개발 툴

- **JAVA:**
- **Spring Boot:**
- **IntelliJ IDEA:** JAVA 개발을 위한 통합 개발 환경
- **MariaDB:** 관계형 데이터베이스
- **Thymeleaf + JPA:** 프론트엔드와 백엔드의 통합을 위한 템플릿 엔진과 객체-관계 매핑을 위해 사용

## 개발 환경 설정

프로젝트를 로컬 환경에서 실행하기 위한 순서

1. **JAVA 설치:** Oracle JDK 또는 OpenJDK를 설치
2. **Spring Boot 설치:** Spring Initializer 또는 Maven/Gradle을 이용하여 프로젝트를 생성
3. **IntelliJ IDEA 설치:** IntelliJ IDEA 공식 사이트에서 다운로드하여 설치
4. **MariaDB 설치:** MariaDB 공식 사이트에서 다운로드하여 설치합니다. [참고](https://velog.io/@jthugg/install-mariadb-in-mac-os-arm64)
5. **프로젝트 설정:** `application.properties` 또는 `application.yml` 파일을 이용하여 데이터베이스 연결 등 필요한 설정
6. **프로젝트 실행:** IntelliJ IDEA에서 프로젝트를 열고 실행

## ERROR

Homebrew로 MariaDB 설치 시 에러가 발생할 경우 다음과 같은 단계를 따름

`# MySQL unlink
brew unlink mysql

# Install MariaDB
brew install mariadb

# Start MariaDB
brew services start mariadb`
