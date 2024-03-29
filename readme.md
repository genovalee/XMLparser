# Parser DS12c印表回傳的XML

<pre style="color:#000000;background:#ffffff;">
<?xml version = '1.0' encoding = 'UTF-8' standalone = 'yes'?>
<serverQueues>
	<job id="58806" queueType="past">
		<name>I:/bin/k0nasso0</name>
		<type>report</type>
		<status code="4">已順利完成報表 .</status>
		<owner>RWUser</owner>
		<server>rep_tpas12cxx</server>
		<destination>
			<desType>file</desType>
			<desName>e:/fsx002/demo.pdf</desName>
			<desFormat>pdf</desFormat>
			<file>demoKT32WTNE.pdf</file>
		</destination>
		<timingInfo>
			<queued>2024/3/29 上午 08:45:16</queued>
			<started>2024/3/29 上午 08:45:16</started>
			<finished>2024/3/29 上午 08:45:18</finished>
		</timingInfo>
	</job>
</serverQueues>
</pre>

## 解析timingInfo節點的資料
<pre style="color:#000000;background:#ffffff;">
queued => 2024/3/29 上午 08:45:16
started => 2024/3/29 上午 08:45:16
finished => 2024/3/29 上午 08:45:18
</pre>