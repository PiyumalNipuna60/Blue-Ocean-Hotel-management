package model;

public class Meal {
    private String MealPlanName;
    private Double Price;

    public Meal() {
    }

    public Meal(String mealPlanName, Double price, String breakfast, String lunch, String evening, String dinner) {
        MealPlanName = mealPlanName;
        Price = price;
    }

    public String getMealPlanName() {
        return MealPlanName;
    }

    public void setMealPlanName(String mealPlanName) {
        MealPlanName = mealPlanName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "MealPlanName='" + MealPlanName + '\'' +
                ", Price=" + Price +
                '}';
    }
}

