# OInjo_Shop
쇼핑몰 프로젝트

프로젝트 구성
1. Entity 객체는 Service 클래스에서만 사용
2. Controller에서는 DTO 객체 사용

회원 가입 및 로그인 
1. 회원 가입 시 데이터베이스에 데이터 저장 (중복 ID 불가능)
2. 로그인 시 세션 저장 (아이디 혹은 비밀번호가 일치하지 않으면 다시 입력)

회원 목록 기능 
1. 데이터베이스에서 전체 회원 원하는 데이터 목록 출력
2. 회원 목록에서 상세 조회 시 특정 회원 전체 데이터 목록 출력

회원 수정 기능
1. 로그인 후 회원 수정 (자동으로 상세 조회)

회원 삭제 기능
1. 회원 삭제

데이터베이스 구성
1. MemberEntity 클래스 (id, memberEmail, memberPassword, memberName, memberNickname, memberPhone, memberAddress)
2. BaseTimeEntity 추상 클래스로 구현 (등록 시간, 수정 시간)
3. BaseEntity 추상 클래스로 구현 (등록자, 수정자)
