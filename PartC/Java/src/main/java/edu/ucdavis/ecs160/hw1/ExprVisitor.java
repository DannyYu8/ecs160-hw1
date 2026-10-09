package edu.ucdavis.ecs160.hw1;

// visitor interface
public interface ExprVisitor<T> {
    // visit method for each node type
    T visit(Num num);
    T visit(Add add);
    T visit(Sub sub);
    T visit (Mult mult);
    T visit (Div div);
}