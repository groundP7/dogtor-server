package com.ground7.dogtor.domain.member.dao;

import com.ground7.dogtor.domain.member.dto.MemberSignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int existsByLoginId(String loginId){
        String sql = "SELECT COUNT(*) FROM member WHERE login_id = ?";
        return jdbcTemplate.queryForObject(sql,Integer.class, loginId);
    }

    signUp(MemberSignUpRequest memberSignUpRequest){
        String sql = "INSERT INTO m.login_id, m.password, m.name, m.phone_number, a.address, a.detail_address, a.postal_code"
    }
}
