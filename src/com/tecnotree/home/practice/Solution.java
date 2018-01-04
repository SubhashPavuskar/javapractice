package com.tecnotree.home.practice;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution
{
	public static class City
	{
		private int clinics;
		private double population;
		private double number_of_vacinated;

		public City(int clinics, int population)
		{
			this.clinics = clinics;
			this.population = population;
			this.number_of_vacinated = population / clinics;
		}

		public double getNumberOfVacinated()
		{
			return number_of_vacinated;
		}

	}

	public static void main(String[] args) throws IOException
	{

		int n = 0;  
		int b = 0;

		Scanner in = new Scanner(System.in);

		

		while (in.hasNextLine())
		{
			String cityAndClinics = in.nextLine();
			if (cityAndClinics.equals("exit"))
			{
				System.exit(0);
			}
			List<String> optionStream = Arrays.stream(cityAndClinics.trim().split("\\s+")).map(s -> s.trim()).collect(Collectors.toList());
			if (1 < optionStream.size() && optionStream.size() < 3)
			{
				n = Integer.parseInt(optionStream.size() > 0 ? optionStream.get(0) : "0"); 
				b = Integer.parseInt(optionStream.size() > 1 ? optionStream.get(1) : "0");
				break;
			}
			
		}

		List<City> cities = new ArrayList<>();

		IntStream.range(0, n).forEach(s -> {

			int population = in.nextInt();
			if (1 <= population && population <= 5000000)
			{
				cities.add(new City(1, population));
			}
			else
			{
				System.exit(1);
			}
		});

		Comparator<City> vacineComparator = Comparator.comparing(City::getNumberOfVacinated);

		IntStream.range(n, b).forEach(s -> {

			Stream t = cities.stream();
			cities.stream().sorted(vacineComparator.reversed()).findFirst().map(c -> {
				c.clinics++;
				c.number_of_vacinated = Math.ceil(c.population / c.clinics);
				return c;
			});

			
		});
		
		

		Integer maxNum = (int) cities.stream().sorted(vacineComparator.reversed()).findFirst().get().getNumberOfVacinated();
		System.out.println(maxNum);
	}
}
