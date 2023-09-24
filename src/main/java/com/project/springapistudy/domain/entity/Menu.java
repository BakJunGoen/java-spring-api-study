package com.project.springapistudy.domain.entity;


import com.project.springapistudy.domain.enums.MenuType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column
    private Long price;

    @Column
    private MenuType menuType;

    public void update(String name, Long price, MenuType menuType){
        this.name = name;
        this.price = price;
        this.menuType = menuType;
    }


}
