package com.example.demo.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FavoriteType {
    MOVIE("MOVIE", "影片"),
    ACTOR("ACTOR", "演员"),
    TAG("TAG", "影片标签"),
    SERIES("SERIES", "系列番号"),
    ;

    @EnumValue
    @JsonValue
    private final String value;
    private final String label;

    @JsonCreator
    public static FavoriteType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        for (FavoriteType type : FavoriteType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }
}
