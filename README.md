# AOS-KSP-HILT

Jetpack Compose, KSP, MVVM, Hilt를 결합하여 Android 개발을 위한 템플릿<br>
기존 Android 프로젝트에서 KAPT 대신 KSP로 마이그레이션하여 컴파일 시간을 단축하고, Hilt를 통해 각 뷰에 필요한 의존성을 주입시킴<br>
편하게 이야기 하자면.. AOS 개발할 때 이 구조 기반으로 하면 좋지않을까 하는 생각에서 시작함<br>

## 개발 환경
- Java: 1.8
- Kotlin: 1.9.0
- Gradle: 8.3.0
- IDE: Android Studio Arctic Fox 이상
- Compile SDK: 34
- Min SDK: 24
- Target SDK: 34 

## 주요 기술
- 언어: Kotlin
- 아키텍처: MVVM (Model-View-ViewModel)
- UI 라이브러리: Jetpack Compose
- 의존성 관리 라이브러리: Hilt (Dagger 기반)
- 어노테이션 프로세서: KSP (Kotlin Symbol Processing)

## 주요 기능 및 장점
### KSP 사용의 장점
- 컴파일 속도 향상: KAPT 대신 KSP를 사용하여 빌드 시간을 단축시키고, 성능 최적화에 가까워짐
- 코드 유지보수: KSP는 Kotlin 코드와 직접 상호작용이 가능하여 코드베이스가 간결해짐

### Hilt를 사용한 의존성 주입
- 간단한 의존성 주입: Hilt를 사용하여 의존성 주입을 간편하고 효율적으로 처리함. 코드에서 각 뷰나 컴포넌트에 필요한 의존성을 쉽게 주입할 수 있다는 것이 매력적으로 다가옴
- Singleton 관리: @Singleton을 활용해 애플리케이션의 중요한 클래스들을 앱의 수명 주기 동안 하나의 인스턴스로 관리함
- 모듈화 및 테스트 용이성: 코드가 모듈화되어 있으며, 의존성 주입 덕분에 테스트 작성이 용이해짐