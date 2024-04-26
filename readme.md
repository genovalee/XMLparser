# Parser DS12c印表回傳的XML

```xml
&lt;?xml version = '1.0' encoding = 'UTF-8' standalone = 'yes'?&gt;
&lt;serverQueues&gt;
	&lt;job id="58806" queueType="past"&gt;
		&lt;name&gt;I:/bin/k0nasso0&lt;/name&gt;
		&lt;type&gt;report&lt;/type&gt;
		&lt;status code="4"&gt;已順利完成報表 .&lt;/status&gt;
		&lt;owner&gt;RWUser&lt;/owner&gt;
		&lt;server&gt;rep_tpas12cxx&lt;/server&gt;
		&lt;destination&gt;
			&lt;desType&gt;file&lt;/desType&gt;
			&lt;desName&gt;e:/fsx002/demo.pdf&lt;/desName&gt;
			&lt;desFormat&gt;pdf&lt;/desFormat&gt;
			&lt;file&gt;demoKT32WTNE.pdf&lt;/file&gt;
		&lt;/destination&gt;
		&lt;timingInfo&gt;
			&lt;queued&gt;2024/3/29 上午 08:45:16&lt;/queued&gt;
			&lt;started&gt;2024/3/29 上午 08:45:16&lt;/started&gt;
			&lt;finished&gt;2024/3/29 上午 08:45:18&lt;/finished&gt;
		&lt;/timingInfo&gt;
	&lt;/job&gt;
&lt;/serverQueues&gt;
```

## 解析timingInfo節點的資料
queued = 2024/3/29 上午 08:45:16
started = 2024/3/29 上午 08:45:16
finished = 2024/3/29 上午 08:45:18
