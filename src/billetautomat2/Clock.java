package billetautomat2;
import javax.swing.JLabel;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Clock {
	public String getTime() {
Calendar now = Calendar.getInstance();
		int h = now.get(Calendar.HOUR_OF_DAY);
		int m = now.get(Calendar.MINUTE);
		int s = now.get(Calendar.SECOND);
		String time = h + ":" + m + ":" + s;
		return time;
	}
	public void updateTime (boolean updateTime, JLabel label) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				while (updateTime) {
					label.setText(this.getTime());
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			private String getTime() {
				Calendar now = Calendar.getInstance();
				int h = now.get(Calendar.HOUR_OF_DAY);
				int m = now.get(Calendar.MINUTE);
				int s = now.get(Calendar.SECOND);
				if (h < 10 && m < 10 && s < 10) {
					String time = h + ":" + m + ":" + s;
					return time;
				};
				if (s < 10 && m < 10) {
					String time = h + ":0" + m + ":0" + s;
					return time;
				}
				if (s < 10 && h < 10) {
					String time = "0" + h + ":" + m + ":0" + s;
					return time;
				};
				if (h < 10 && m < 10) {
					String time = "0" + h + ":0" + m + ":" + s;
					return time;
				};
				if (s < 10) {
					String time = h + ":" + m + ":0" + s; 
					return time;
				};
				if (m < 10) {
					String time = h + ":0" + m + ":" + s;
					return time;
				};
				if (h < 10) {
					String time = "0" + h + ":" + m + ":" + s;
					return time;
				};
				String time = h + ":" + m + ":" + s;
				return time;
			}
			
		});
		thread.start();
	}
}
