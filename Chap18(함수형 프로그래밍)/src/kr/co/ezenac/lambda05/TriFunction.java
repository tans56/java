package kr.co.ezenac.lambda05;


@FunctionalInterface
public interface TriFunction <T, U, Y, R> {
	
	R apply(T t, U u, Y y);
	
}