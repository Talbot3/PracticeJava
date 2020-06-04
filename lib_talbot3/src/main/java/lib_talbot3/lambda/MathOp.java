package lib_talbot3.lambda;

@FunctionalInterface
public interface MathOp<E> {
  E op(E a, E b);
}