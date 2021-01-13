package com.jio.aidl_server.sdk;

import android.os.Parcel;

public class OrientationModel implements android.os.Parcelable {
    private String currentOrientation;
    private String timeStamp;
    private String accuracy;
    private String maxEventsCount;
    private String reserverdEventsCount;
    private String HighestDirectReportRateLevel;
    private String id;
    private String maxDelay;
    private String maxRange;
    private String minDelay;
    private String name;
    private String power;
    private String reportingMode;
    private String resolution;
    private String stringType;
    private String type;
    private String vendor;
    private String version;

    protected OrientationModel(Parcel in) {
        currentOrientation = in.readString();
        timeStamp = in.readString();
        accuracy = in.readString();
        maxEventsCount = in.readString();
        reserverdEventsCount = in.readString();
        HighestDirectReportRateLevel = in.readString();
        id = in.readString();
        maxDelay = in.readString();
        maxRange = in.readString();
        minDelay = in.readString();
        name = in.readString();
        power = in.readString();
        reportingMode = in.readString();
        resolution = in.readString();
        stringType = in.readString();
        type = in.readString();
        vendor = in.readString();
        version = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(currentOrientation);
        dest.writeString(timeStamp);
        dest.writeString(accuracy);
        dest.writeString(maxEventsCount);
        dest.writeString(reserverdEventsCount);
        dest.writeString(HighestDirectReportRateLevel);
        dest.writeString(id);
        dest.writeString(maxDelay);
        dest.writeString(maxRange);
        dest.writeString(minDelay);
        dest.writeString(name);
        dest.writeString(power);
        dest.writeString(reportingMode);
        dest.writeString(resolution);
        dest.writeString(stringType);
        dest.writeString(type);
        dest.writeString(vendor);
        dest.writeString(version);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<OrientationModel> CREATOR = new Creator<OrientationModel>() {
        @Override
        public OrientationModel createFromParcel(Parcel in) {
            return new OrientationModel(in);
        }

        @Override
        public OrientationModel[] newArray(int size) {
            return new OrientationModel[size];
        }
    };

    public String getCurrentOrientation() {
        return currentOrientation;
    }

    public void setCurrentOrientation(String currentOrientation) {
        this.currentOrientation = currentOrientation;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getMaxEventsCount() {
        return maxEventsCount;
    }

    public void setMaxEventsCount(String maxEventsCount) {
        this.maxEventsCount = maxEventsCount;
    }

    public String getReserverdEventsCount() {
        return reserverdEventsCount;
    }

    public void setReserverdEventsCount(String reserverdEventsCount) {
        this.reserverdEventsCount = reserverdEventsCount;
    }

    public String getHighestDirectReportRateLevel() {
        return HighestDirectReportRateLevel;
    }

    public void setHighestDirectReportRateLevel(String highestDirectReportRateLevel) {
        HighestDirectReportRateLevel = highestDirectReportRateLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaxDelay() {
        return maxDelay;
    }

    public void setMaxDelay(String maxDelay) {
        this.maxDelay = maxDelay;
    }

    public String getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(String maxRange) {
        this.maxRange = maxRange;
    }

    public String getMinDelay() {
        return minDelay;
    }

    public void setMinDelay(String minDelay) {
        this.minDelay = minDelay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getReportingMode() {
        return reportingMode;
    }

    public void setReportingMode(String reportingMode) {
        this.reportingMode = reportingMode;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getStringType() {
        return stringType;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static Creator<OrientationModel> getCREATOR() {
        return CREATOR;
    }
}
