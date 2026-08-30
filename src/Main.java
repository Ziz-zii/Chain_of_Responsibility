//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Handler chain = new ChainBuilder()
            .addHandler(new Operator())
            .addHandler(new Specialist())
            .addHandler(new Expert())
            .build();

    Request[] testRequests = {
            new Request("Не работает мышь", 1),
            new Request("Не открывается Word", 2),
            new Request("Система тормозит", 3),
            new Request("Ошибка в базе данных", 4),
            new Request("Сервер не стартует", 5),
            new Request("Крах всей системы", 10)
    };

    for (Request req : testRequests) {
        System.out.println("\n" + req);
        System.out.println("-".repeat(40));
        chain.handle(req);
    }
}