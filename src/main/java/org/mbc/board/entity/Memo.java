package org.mbc.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // 데이터베이스관련 객체임을 선언한다.
@Table(name="tbl_memo") // 데이터베이스 테이블명을 선언
@ToString
@Getter
@Builder // 빌더패턴 사용 member.setName(), member.GetName() -> member.name()
@AllArgsConstructor // 모든 필드값을 이용해서 생선자
@NoArgsConstructor //기본생성자
public class Memo {

    @Id // pk임을 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // GenerationType.IDENTITY -> pk를 자동으로 생성하고자함.(키생성 전략)
    // 만일 연결되는 데이터베이스가 오라클이면 번호를 위한 별도의 테이블을 생성 (시퀀스)
    // MySQL이나 MariaDB면 Auto increment를 기본으로 사용해서 새로은 레코드가 기록될때 다른 번호를 줌
    // GenerationType.AUTO -> JPA가 알아서 생성방식을 결정
    // GenerationType.SEQUENCE -> 데이터베이스의 sequence를 이용해서 키를 생성
    // GenerationType.TABLE -> 키생성 전용 테이블을 생성해서 키를 생성

    private  Long mno;

    @Column(length =  200, nullable = false) // 200글자에 notnull적용
    private String memoText;

}
