package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AppCalcDateHour {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate pastMonthLocalDate = d04.minusMonths(7);
		LocalDate nextMonthLocalDate = d04.plusMonths(7);
		LocalDate pastYearsLocalDate = d04.minusYears(7);
		LocalDate nextYearsLocalDate = d04.plusYears(7);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		LocalDateTime pastMonthLocalDateTime = d05.minusMonths(7);
		LocalDateTime nextMonthLocalDateTime = d05.plusMonths(7);
		LocalDateTime pastYearsLocalDateTime = d05.minusYears(7);
		LocalDateTime nextYearsLocalDateTime = d05.plusYears(7);
		
		Instant pastDaysInstant = d06.minus(10, ChronoUnit.DAYS);
		Instant nextDaysInstant = d06.plus(10, ChronoUnit.DAYS);
		Instant pastHourInstant = d06.minus(10, ChronoUnit.HOURS);
		Instant nextHourInstant = d06.plus(10, ChronoUnit.HOURS);
		Instant pastMinutesInstant = d06.minus(10, ChronoUnit.MINUTES);
		Instant nextMinutesInstant = d06.plus(10, ChronoUnit.MINUTES);
		
		System.out.println("Data local sete dias atrás = " + pastWeekLocalDate);
		System.out.println("Data local sete dias depois = " + nextWeekLocalDate);
		System.out.println("Data local sete meses atrás = " + pastMonthLocalDate);
		System.out.println("Data local sete meses depois = " + nextMonthLocalDate);
		System.out.println("Data local sete anos atrás = " + pastYearsLocalDate);
		System.out.println("Data local sete anos depois = " + nextYearsLocalDate);
		System.out.println();
		
		System.out.println("Data e hora local sete dias antes = " + pastWeekLocalDateTime);
		System.out.println("Data e hora local sete dias depois = " + nextWeekLocalDateTime);
		System.out.println("Data e hora local sete meses atrás = " + pastMonthLocalDateTime);
		System.out.println("Data e hora local sete meses depois = " + nextMonthLocalDateTime);
		System.out.println("Data e hora local sete anos atrás = " + pastYearsLocalDateTime);
		System.out.println("Data e hora local sete anos depois = " + nextYearsLocalDateTime);
		System.out.println();
		
		System.out.println("Data e hora local dez dias atrás = " + pastDaysInstant);
		System.out.println("Data e hora local dez dias depois = " + nextDaysInstant);
		System.out.println("Data e hora local dez horas atrás = " + pastHourInstant);
		System.out.println("Data e hora local dez horas depois = " + nextHourInstant);
		System.out.println("Data e hora local dez minutos atrás = " + pastMinutesInstant);
		System.out.println("Data e hora local dez minutos depois = " + nextMinutesInstant);
		
	}

}
