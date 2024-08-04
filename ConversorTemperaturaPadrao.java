public class ConversorTemperaturaPadrao implements ConversorTemperatura{
public void celsiusParaFahrenheit(double celsius){
    double fahrenheit = (celsius * 1.8) + 32;
    System.out.println(fahrenheit);


}
public void fahrenheitParaCelsius(double fahrenheit){
    double celsius = (32 - fahrenheit) / 1.8;
    System.out.println(celsius);


}

}
