import pandas as pd
import matplotlib.pyplot as plt
from datetime import datetime
import time

df = pd.read_csv("ObserverLog.csv")

timeAxys = df["Time"].values.tolist()
first = datetime.strptime(timeAxys[0], "%M:%S")
tempi = []
for i in timeAxys:
    t1 = datetime.strptime(i, "%M:%S")
    tempi.append((t1-first).seconds)

plt.plot(tempi, df["Value"].values.tolist(),"o")

plt.savefig("plot.png")
