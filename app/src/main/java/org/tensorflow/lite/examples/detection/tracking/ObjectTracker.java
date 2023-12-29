package org.tensorflow.lite.examples.detection.tracking;

        import android.graphics.RectF;

        import org.tensorflow.lite.examples.detection.tflite.Classifier;

        import java.util.HashMap;
        import java.util.Map;

public class ObjectTracker {
    private Map<Integer, String> trackedObjects;

    //추가함
    private static class TrackedObject {
        String objectName;
        long lastRecognizedTimestamp;

        TrackedObject(String objectName, long lastRecognizedTimestamp) {
            this.objectName = objectName;
            this.lastRecognizedTimestamp = lastRecognizedTimestamp;
        }
    }

    public ObjectTracker() {
        trackedObjects = new HashMap<>();
    }

    public void trackObject(int objectId, String objectName) {
        trackedObjects.put(objectId, objectName);
    }

    public boolean isObjectTracked(int objectId) {
        return trackedObjects.containsKey(objectId);
    }

    public void clearTrackedObjects() {
        trackedObjects.clear();
    }
}
