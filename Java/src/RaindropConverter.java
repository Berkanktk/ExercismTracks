class RaindropConverter {
    String rainDropString = "";

    String convert(int number) {
        if (number % 3 == 0) rainDropString += "Pling";
        if (number % 5 == 0) rainDropString += "Plang";
        if (number % 7 == 0) rainDropString += "Plong";
        if (rainDropString.equals("")) return Integer.toString(number);

        return rainDropString;
    }
}
