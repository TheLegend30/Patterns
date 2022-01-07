package creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());

        Website website = director.buildWebsite();
        System.out.println(website.toString());


        director.setBuilder(new VisitCardWebsiteBuilder());

        website = director.buildWebsite();
        System.out.println(website.toString());
    }
}
