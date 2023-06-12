package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AppCalcDuration {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(10);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(10);
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		Instant pastDaysInstant = d06.minus(10, ChronoUnit.DAYS);
		Instant nextDaysInstant = d06.plus(10, ChronoUnit.DAYS);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());	//no Duration precisa converter o LocalDate para LocalDateTime
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastDaysInstant, d06);	//observar a ordem das datas
		Duration t4 = Duration.between(d06, pastDaysInstant);	//data menor antes a contagem é negativa
		
		System.out.println("Duração em dias = " + t1.toDays());
		System.out.println("Duração em dias = " + t2.toDays());
		System.out.println("Duração em dias = " + t3.toDays());
		System.out.println("Duração em dias = " + t4.toDays());

	}

}
