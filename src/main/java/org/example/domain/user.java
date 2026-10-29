package org.example.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    @TableId
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;
    private Integer deleted;
    @Version
    private Integer version;
}
