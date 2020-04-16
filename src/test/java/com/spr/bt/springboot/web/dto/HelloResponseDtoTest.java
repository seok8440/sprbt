package com.spr.bt.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given(준비)
        String name= "test";
        int amount = 1000;

        //when(실행)
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then(검증)
        assertThat(dto.getName()).isEqualTo(name); // 1, 2
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
