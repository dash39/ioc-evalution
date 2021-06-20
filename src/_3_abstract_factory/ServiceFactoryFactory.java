package _3_abstract_factory;

public class ServiceFactoryFactory {
    public static ServiceFactory createServiceFactory() {
        return new ModestUserServiceFactory();
    }

    // may be you even have many service factories here
}
