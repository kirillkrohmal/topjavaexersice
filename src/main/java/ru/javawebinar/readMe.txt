Реализовать метод UserMealsUtil.getFilteredWithExceeded:
-  должны возвращаться только записи между startTime и endTime
-  поле UserMealWithExceed.exceed должно показывать,
                                     превышает ли сумма калорий за весь день параметра метода caloriesPerDay

Т.е UserMealWithExceed - это запись одной еды, но поле exceeded будет одинаково для всех записей за этот день.

- Проверьте результат выполнения ДЗ (можно проверить логику в http://topjava.herokuapp.com , список еды)
- Оцените Time complexity вашего алгоритма, если он O(N*N)- попробуйте сделать O(N).

Замечания к HW0
1: Код проекта менять можно! Одна из распространенных ошибок как в тестовых заданиях на собеседовании, так и при работе на проекте,
что ничего нельзя менять. Конечно при правках в рабочем проекте обязательно нужно проконсультироваться/проревьюироваться у авторов кода
(находится по истории VCS)
2: Наследовать UserMealWithExceed от UserMeal я не буду, т.к. это разные сущности: Transfer Object и Entity. Мы будет их проходить на 2м уроке.
3: Правильная реализация должна быть простой и красивой, можно сделать 2-мя способами: через стримы и через циклы. Сложность должна быть O(N), т.е.
без вложенных стримов и циклов.
4: При реализации через циклы посмотрите в Map на методы getOrDefault или merge
5: При реализации через Stream заменяйте forEach оператором stream.map(..)
6: Объявляйте переменные непосредственно перед использованием (если возможно - сразу с инициализацией). При объявлении коллекций используйте тип
переменной - интерфейс (Map, List, ..)
7: Если IDEA предлагает оптимизацию (желтым подчеркивает), например заменить лямбду на метод-референс, соглашайтесь (Alt+Enter)
8: Пользуйтесь форматированием кода в IDEA: Alt+Ctrl+L
9: Перед check-in проверяйте чендж-лист (курсор на файл и Ctrl+D): не оставляйте в коде ничего лишнего (закомментированный код, TODO и пр.).
Если файл не меняется (например только пробелы или переводы строк), не надо его чекинить, делайте ему revert (Git -> Revert / Ctrl+Alt+Z).
10: System.out.println нельзя делать нигде, кроме как в main. Позже введем логирование.
11: Результаты, возвращаемые UserMealsUtil.getFilteredWithExceeded мы будем использовать в нашем приложении для фильтрации по времени и отображения
еды правильным цветом.
12: Обращайте внимание на комментарии к вашим коммитам в git. Они должны быть короткие и информативные (лучше на english)
13: Не полагайтесь в решении на то, что список будет подаваться отсортированным. Такого условия нет.