package edu.ucdavis.ecs160.hw1;

public interface Expr {
    // accept method signature
    <T> T accept(ExprVisitor<T> visitor);
}
