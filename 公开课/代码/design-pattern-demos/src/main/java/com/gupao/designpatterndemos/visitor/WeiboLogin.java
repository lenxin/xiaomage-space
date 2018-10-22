package com.gupao.designpatterndemos.visitor;

/**
 * 微博登录
 *
 * @author 小马哥 QQ 1191971402
 * @copyright 咕泡学院出品
 * @since 2018/3/17
 */
public class WeiboLogin implements Login {
    @Override
    public void accept(Visitor visitor) {

        System.out.println(
                visitor.getClass().getSimpleName() + " 通过微博登录");
    }
}
