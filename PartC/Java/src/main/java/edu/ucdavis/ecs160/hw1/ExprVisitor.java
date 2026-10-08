package edu.ucdavis.ecs160.hw1;

public interface ExprVisitor<T> {
    T visit(Num num);
    T visit(Add add);
    T visit(Sub sub);
    T visit (Mult mult);
    T visit (Div div);
}