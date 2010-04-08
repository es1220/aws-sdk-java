/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Terminate Job Flows Request
 */
public class TerminateJobFlowsRequest extends AmazonWebServiceRequest {

    /**
     * A list of job flow IDs specifying the job flows to terminate. Each
     * <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     * operation. To terminate more than one job flow, set this parameter to
     * a comma-seperate list of <code>JobFlowID</code>s.
     */
    private java.util.List<String> jobFlowIds;

    /**
     * A list of job flow IDs specifying the job flows to terminate. Each
     * <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     * operation. To terminate more than one job flow, set this parameter to
     * a comma-seperate list of <code>JobFlowID</code>s.
     *
     * @return A list of job flow IDs specifying the job flows to terminate. Each
     *         <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     *         operation. To terminate more than one job flow, set this parameter to
     *         a comma-seperate list of <code>JobFlowID</code>s.
     */
    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new java.util.ArrayList<String>();
        }
        return jobFlowIds;
    }
    
    /**
     * A list of job flow IDs specifying the job flows to terminate. Each
     * <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     * operation. To terminate more than one job flow, set this parameter to
     * a comma-seperate list of <code>JobFlowID</code>s.
     *
     * @param jobFlowIds A list of job flow IDs specifying the job flows to terminate. Each
     *         <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     *         operation. To terminate more than one job flow, set this parameter to
     *         a comma-seperate list of <code>JobFlowID</code>s.
     */
    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;
    }
    
    /**
     * A list of job flow IDs specifying the job flows to terminate. Each
     * <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     * operation. To terminate more than one job flow, set this parameter to
     * a comma-seperate list of <code>JobFlowID</code>s.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds A list of job flow IDs specifying the job flows to terminate. Each
     *         <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     *         operation. To terminate more than one job flow, set this parameter to
     *         a comma-seperate list of <code>JobFlowID</code>s.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateJobFlowsRequest withJobFlowIds(String... jobFlowIds) {
        for (String value : jobFlowIds) {
            getJobFlowIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of job flow IDs specifying the job flows to terminate. Each
     * <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     * operation. To terminate more than one job flow, set this parameter to
     * a comma-seperate list of <code>JobFlowID</code>s.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds A list of job flow IDs specifying the job flows to terminate. Each
     *         <code>JobFlowId</code> is a string returned by the <a>RunJobFlows</a>
     *         operation. To terminate more than one job flow, set this parameter to
     *         a comma-seperate list of <code>JobFlowID</code>s.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateJobFlowsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("JobFlowIds: " + jobFlowIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    