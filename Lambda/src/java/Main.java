interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

class ExecutableImplementation implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new ExecutableImplementation());

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello!");
            }
        });

        runner.run(() -> System.out.println("Hello!!"));
    }
}
