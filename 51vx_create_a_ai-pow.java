package ai.iot.device.analyzer;

import java.util.ArrayList;
import java.util.List;

public interface AIpoweredIoTDeviceAnalyzer {

    // Device Information
    public String getDeviceName();
    public String getDeviceType();
    public String getDeviceIP();

    // Sensor Data
    public List<String> getSensorList();
    public double getSensorValue(String sensorName);
    public void setSensorValue(String sensorName, double value);

    // AI-powered Analytics
    public String predictDeviceFailure();
    public String identifyAnomalies();
    public String getInsights();

    // IoT Communication
    public void sendCommand(String command);
    public void receiveData(String data);

    // Device Control
    public void restartDevice();
    public void shutDownDevice();

    // AI Model
    public void trainAIModel();
    public void updateAIModel();
    public void saveAIModel();

    // Data Storage
    public void storeSensorData(String data);
    public void retrieveSensorData();

    // API Connections
    public void connectToCloud();
    public void disconnectFromCloud();

    // Error Handling
    public void handleDeviceError(String error);
    public void handleAIModelError(String error);
}