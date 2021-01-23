package co.hw.spex.main.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice { //aspect
	@Around("execution(* co.hw.spex..*Impl.*(..))")
	public Object logBefore(ProceedingJoinPoint joinPoint) throws Throwable {
		//@Before = jointcut
		Object result;
		//타겟 메서드의 signature 정보
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + "시작");
		
		//타겟의 메소드가 호출되기 전의 시간
		long start = System.currentTimeMillis();
		try {
			//타겟의 메서드 호풀
			result = joinPoint.proceed();
			return result;
		} finally {
			//타겟의 메서드가 호출 된 후의 시간
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + "종료");
			System.out.println(signatureString + "실행 시간 : " + (finish - start) + "ms");
		}
	}
	
//	//aspect
//	@Around("execution(* co.hw.spex..*Impl.*(..))") //포인트
//	public void logBefore() { //advice
//		System.out.println("========동작========");
//	}
//	//aop-context.xml로 위빙을 해준다.
}
