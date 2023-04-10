-- 1.	Создайте функцию, которая принимает кол-во сек и форматирует их в кол-во дней,
-- часов, минут и секунд.
-- Пример: 123456 ->'1 days 10 hours 17 minutes 36 seconds '

CREATE or Replace FUNCTION convert(number int)
    RETURNS text
    LANGUAGE plpgsql
AS
$$
    declare convertType text;
begin
    convertType := to_char(justify_hours(interval '1 sec' * number),
        'DD" days "HH24" hours "MI" minutes "SS" seconds"');
    RETURN convertType;
end;
$$;

select convert(123456);


-- 2.	Выведите только четные числа от 1 до 10 включительно. (Через функцию / процедуру)
-- Пример: 2,4,6,8,10 (можно сделать через шаг +  2: х = 2, х+=2)

CREATE or Replace FUNCTION oddNumbers()
    RETURNS integer[]
    LANGUAGE plpgsql
AS
$$
declare masOddNumbers integer[];
    buffer int:= 2;
begin
    while buffer <= 10
    loop
        masOddNumbers:= array_append(masOddNumbers, buffer);
        buffer:= buffer + 2;
        end loop;
    RETURN masOddNumbers;
end;
$$;


select oddNumbers();