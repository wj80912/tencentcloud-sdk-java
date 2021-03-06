/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaunchConfiguration  extends AbstractModel{

    /**
    * 实例所属项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 启动配置ID。
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * 启动配置名称。
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例系统盘配置信息。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 实例数据盘配置信息。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * 实例登录设置。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LimitedLoginSettings LoginSettings;

    /**
    * 公网带宽相关信息设置。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 实例所属安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 启动配置关联的伸缩组。
    */
    @SerializedName("AutoScalingGroupAbstractSet")
    @Expose
    private AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet;

    /**
    * 自定义数据。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 启动配置创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 实例的增强服务启用情况与其设置。
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * 镜像ID。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
    */
    @SerializedName("LaunchConfigurationStatus")
    @Expose
    private String LaunchConfigurationStatus;

    /**
     * 获取实例所属项目ID。
     * @return ProjectId 实例所属项目ID。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置实例所属项目ID。
     * @param ProjectId 实例所属项目ID。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取启动配置ID。
     * @return LaunchConfigurationId 启动配置ID。
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * 设置启动配置ID。
     * @param LaunchConfigurationId 启动配置ID。
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * 获取启动配置名称。
     * @return LaunchConfigurationName 启动配置名称。
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * 设置启动配置名称。
     * @param LaunchConfigurationName 启动配置名称。
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * 获取实例机型。
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取实例系统盘配置信息。
     * @return SystemDisk 实例系统盘配置信息。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * 设置实例系统盘配置信息。
     * @param SystemDisk 实例系统盘配置信息。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * 获取实例数据盘配置信息。
     * @return DataDisks 实例数据盘配置信息。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * 设置实例数据盘配置信息。
     * @param DataDisks 实例数据盘配置信息。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * 获取实例登录设置。
     * @return LoginSettings 实例登录设置。
     */
    public LimitedLoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * 设置实例登录设置。
     * @param LoginSettings 实例登录设置。
     */
    public void setLoginSettings(LimitedLoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * 获取公网带宽相关信息设置。
     * @return InternetAccessible 公网带宽相关信息设置。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * 设置公网带宽相关信息设置。
     * @param InternetAccessible 公网带宽相关信息设置。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * 获取实例所属安全组。
     * @return SecurityGroupIds 实例所属安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * 设置实例所属安全组。
     * @param SecurityGroupIds 实例所属安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * 获取启动配置关联的伸缩组。
     * @return AutoScalingGroupAbstractSet 启动配置关联的伸缩组。
     */
    public AutoScalingGroupAbstract [] getAutoScalingGroupAbstractSet() {
        return this.AutoScalingGroupAbstractSet;
    }

    /**
     * 设置启动配置关联的伸缩组。
     * @param AutoScalingGroupAbstractSet 启动配置关联的伸缩组。
     */
    public void setAutoScalingGroupAbstractSet(AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet) {
        this.AutoScalingGroupAbstractSet = AutoScalingGroupAbstractSet;
    }

    /**
     * 获取自定义数据。
     * @return UserData 自定义数据。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * 设置自定义数据。
     * @param UserData 自定义数据。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * 获取启动配置创建时间。
     * @return CreatedTime 启动配置创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置启动配置创建时间。
     * @param CreatedTime 启动配置创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取实例的增强服务启用情况与其设置。
     * @return EnhancedService 实例的增强服务启用情况与其设置。
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * 设置实例的增强服务启用情况与其设置。
     * @param EnhancedService 实例的增强服务启用情况与其设置。
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * 获取镜像ID。
     * @return ImageId 镜像ID。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * 设置镜像ID。
     * @param ImageId 镜像ID。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 获取启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
     * @return LaunchConfigurationStatus 启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
     */
    public String getLaunchConfigurationStatus() {
        return this.LaunchConfigurationStatus;
    }

    /**
     * 设置启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
     * @param LaunchConfigurationStatus 启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
     */
    public void setLaunchConfigurationStatus(String LaunchConfigurationStatus) {
        this.LaunchConfigurationStatus = LaunchConfigurationStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "AutoScalingGroupAbstractSet.", this.AutoScalingGroupAbstractSet);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "LaunchConfigurationStatus", this.LaunchConfigurationStatus);

    }
}

