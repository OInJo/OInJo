package kr.idu.OInjo_Shop.repository;

import kr.idu.OInjo_Shop.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회
    Optional<MemberEntity> findByMemberEmail(String memberEmail);
    // 기본적으로 하나를 조회할 때 Repository는 Optional로 넘겨줌
}
