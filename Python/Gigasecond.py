import datetime

GIGASECOND = 10**9


def add(moment):
    return moment + datetime.timedelta(seconds=GIGASECOND)


if __name__ == '__main__':
    print(datetime.timedelta(seconds=GIGASECOND))
    print(add(datetime.datetime(2011, 4, 25, 0, 0)))  # year, month, day, hour, minute
