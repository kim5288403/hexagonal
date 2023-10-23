# Hexagonal Architecture 프로젝트

이 프로젝트는 QueryDSL, Spring Boot, 그리고 Hexagonal Architecture 를 사용하여 개발된 애플리케이션입니다.

## 프로젝트 설명

이 프로젝트의 목적은 데이터베이스에서 데이터를 조회하고 제공하는 RESTful 웹 서비스를 구축하는 것입니다. Hexagonal Architecture를 따르며, 비즈니스 로직은 도메인 패키지에, 데이터 엑세스 관련 로직은 어댑터 패키지에 구현되어 있습니다. Spring Boot와 QueryDSL를 사용하여 데이터베이스와의 상호작용을 처리합니다.

## 🛠 **개발 환경**

- 언어: Java 17
- 프레임워크: Spring Boot 3.1.4
- 빌드 도구: Gradle 7.6
- QueryDSL 5.0.0
- 데이터베이스: MySQL 8.0.33
- 테스트 데이터베이스: H2 Database

## 👨‍💻 **소프트웨어 설계 및 개발**
- Hexagonal Architecture
- 도메인 주도 개발 (DDD)
- 테스트 주도 개발 (TDD)

## 🖥 주요 개발 내용

#### Hexagonal Architecture 프로젝트의 주요 개발 내용은 다음과 같습니다.

- **Hexagonal Architecture (포트와 어댑터 아키텍처) 구현**: Hexagonal Architecture를 활용하여 소프트웨어의 아키텍처를 설계했습니다. 이 아키텍처는 내부와 외부 요소 간의 분리를 강조하며, 주요 구성 요소는 다음과 같습니다:
  - 도메인 로직: 핵심 비즈니스 로직을 담고 있는 도메인 모듈입니다. 이 모듈은 외부 시스템과 독립적으로 설계되며, 데이터베이스, 외부 API 등의 상세한 구현과 분리됩니다.
  - 포트 (Ports): 외부에서 애플리케이션으로 데이터 및 요청을 주고 받는 인터페이스입니다. 이 포트들은 어댑터들과 상호작용하여 외부 시스템과 통신합니다.
  - 어댑터 (Adapters): 포트를 실제로 구현하는 구성요소로, 외부 시스템과의 통신, 데이터베이스 액세스, 웹 요청 처리 등을 다룹니다.

- **QueryDSL를 활용한 데이터베이스 액세스**: QueryDSL을 사용하여 데이터베이스 액세스를 관리하고 도메인 객체와의 상호작용을 효과적으로 구현했습니다. 이를 통해 데이터베이스 쿼리를 Java 코드로 표현하고 타입 안정성을 확보하며, 데이터베이스 쿼리의 품질을 향상시켰습니다.

- **Domain Driven Development (DDD) 설계**: 도메인 주도 개발 방식을 채택하여 각 도메인을 모델링하고 개발했습니다.

- **Test Driven Development (TDD) 개발**: BDD 스타일로 TDD를 수행하여 소프트웨어의 품질을 유지했습니다.


## 📝 프로젝트 구조


프로젝트 구조는 다음과 같습니다:

- `src/main/java/com/example/hexagonla/post/application` : 어플리케이션 서비스 및 Use Case 인터페이스
- `src/main/java/com/example/hexagonla/post/domain` : 도메인 모델과 비즈니스 로직
- `src/main/java/com/example/hexagonla/post/adapter` : RESTful 컨트롤러 및 API 계층 및 데이터베이스 엑세스를 위한 어댑터 및 저장소 구현

## 👨‍💻 **작성자 정보**

- 작성자: limJyeok
- 이메일 주소: kim5288403[@gmail.com](mailto:myusername@example.com)
- GitHub: https://github.com/kim5288403/hexagonal