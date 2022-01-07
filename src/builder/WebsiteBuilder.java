package builder;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void builCms();

    abstract void buildPice();

    Website getWebsite() {
        return website;
    }
}
