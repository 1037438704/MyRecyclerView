package com.example.dell_pc.myrecyclerview.bean;

/**
 *
 * @author dell-pc
 * @date 2018/6/25
 */

public class ModeBase {
    public static final int TYPE_ONE = 1;
    public static final int TYPE_TWO = 2;
    public static final int TYPE_THREE = 3;

    public int type;
    public int avatarColor;
    public String name;
    public String content;
    public int contentColor;

    @Override
    public String toString() {
        return "ModeBase{" +
                "type=" + type +
                ", avatarColor=" + avatarColor +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", contentColor=" + contentColor +
                '}';
    }
}
