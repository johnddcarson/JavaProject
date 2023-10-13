package Section6;

public class PaintShop {

	public static void main(String[] args) {

		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {

		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}

		double wallArea = width * height;
		double bucketsNeeded = wallArea / areaPerBucket;
		double bucketsToBuy = bucketsNeeded - extraBuckets;
		return (int) Math.ceil(bucketsToBuy);

	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {

		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		double wallArea = width * height;
		double bucketsNeeded = wallArea / areaPerBucket;
		double bucketsToBuy = bucketsNeeded;
		return (int) Math.ceil(bucketsToBuy);

	}
}