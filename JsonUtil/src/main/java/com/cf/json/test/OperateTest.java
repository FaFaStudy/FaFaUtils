package com.cf.json.test;

import com.cf.json.util.JsonUtil;

public class OperateTest {
    public static void main(String[] args) {
        String json="{\n" +
                "\t\"errcode\": 0,\n" +
                "\t\"process_instance\": {\n" +
                "\t\t\"attached_process_instance_ids\": [],\n" +
                "\t\t\"biz_action\": \"NONE\",\n" +
                "\t\t\"business_id\": \"201910311608000447590\",\n" +
                "\t\t\"cc_userids\": [\n" +
                "\t\t\t\"031928461537738628\",\n" +
                "\t\t\t\"031226653126153773\",\n" +
                "\t\t\t\"142905596223887987\",\n" +
                "\t\t\t\"2811090058800301\",\n" +
                "\t\t\t\"161210562623413664\"\n" +
                "\t\t],\n" +
                "\t\t\"create_time\": \"2019-10-31 16:08:45\",\n" +
                "\t\t\"finish_time\": \"2019-10-31 16:13:46\",\n" +
                "\t\t\"form_component_values\": [{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-ISFFIRRD\",\n" +
                "\t\t\t\t\"name\": \"联合行文单位名称\",\n" +
                "\t\t\t\t\"value\": \"综合监督局\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-ISFFIRRE\",\n" +
                "\t\t\t\t\"name\": \"发文字号\",\n" +
                "\t\t\t\t\"value\": \"鄂卫监局发〔2019〕8\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"DDSelectField\",\n" +
                "\t\t\t\t\"ext_value\": \"{\\\"key\\\":\\\"option_0\\\"}\",\n" +
                "\t\t\t\t\"id\": \"DDSelectField-K1W3RY0F\",\n" +
                "\t\t\t\t\"name\": \"密级\",\n" +
                "\t\t\t\t\"value\": \"秘密\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"DDSelectField\",\n" +
                "\t\t\t\t\"ext_value\": \"{\\\"key\\\":\\\"option_2\\\"}\",\n" +
                "\t\t\t\t\"id\": \"DDSelectField-K1K3YC9N\",\n" +
                "\t\t\t\t\"name\": \"紧急程度\",\n" +
                "\t\t\t\t\"value\": \"平急\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-ISFFIRRG\",\n" +
                "\t\t\t\t\"name\": \"文件标题\",\n" +
                "\t\t\t\t\"value\": \"无证行医\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-ISFFIRRH\",\n" +
                "\t\t\t\t\"name\": \"主送单位\",\n" +
                "\t\t\t\t\"value\": \"卫生计生委\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K1JD33Q5\",\n" +
                "\t\t\t\t\"name\": \"抄送单位\",\n" +
                "\t\t\t\t\"value\": \"卫生健康委\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K1JD33Q6\",\n" +
                "\t\t\t\t\"name\": \"主题词\",\n" +
                "\t\t\t\t\"value\": \"测试\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K237UBD3\",\n" +
                "\t\t\t\t\"name\": \"拟稿人\",\n" +
                "\t\t\t\t\"value\": \"监督\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"DDDateField\",\n" +
                "\t\t\t\t\"id\": \"DDDateField-K237UBD4\",\n" +
                "\t\t\t\t\"name\": \"拟稿日期\",\n" +
                "\t\t\t\t\"value\": \"2019-10-01\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K1JD33Q8\",\n" +
                "\t\t\t\t\"name\": \"主办处室意见\",\n" +
                "\t\t\t\t\"value\": \"null\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"DDSelectField\",\n" +
                "\t\t\t\t\"ext_value\": \"{\\\"key\\\":\\\"option_1\\\"}\",\n" +
                "\t\t\t\t\"id\": \"DDSelectField-K1Z0IDKH\",\n" +
                "\t\t\t\t\"name\": \"会稿\",\n" +
                "\t\t\t\t\"value\": \"不需要其他处室会稿\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K1JD33Q9\",\n" +
                "\t\t\t\t\"name\": \"会稿处室意见\",\n" +
                "\t\t\t\t\"value\": \"null\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K1JD33QA\",\n" +
                "\t\t\t\t\"name\": \"局办公室核稿意见\",\n" +
                "\t\t\t\t\"value\": \"null\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K1JD33QB\",\n" +
                "\t\t\t\t\"name\": \"分管领导审批意见\",\n" +
                "\t\t\t\t\"value\": \"null\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K20EE8VC\",\n" +
                "\t\t\t\t\"name\": \"局领导审批意见\",\n" +
                "\t\t\t\t\"value\": \"null\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K1JD33QC\",\n" +
                "\t\t\t\t\"name\": \"会签单位意见\",\n" +
                "\t\t\t\t\"value\": \"null\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"TextField\",\n" +
                "\t\t\t\t\"id\": \"TextField-K1W4AY1V\",\n" +
                "\t\t\t\t\"name\": \"校对人\",\n" +
                "\t\t\t\t\"value\": \"李进\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"NumberField\",\n" +
                "\t\t\t\t\"id\": \"NumberField-K1W4AY1W\",\n" +
                "\t\t\t\t\"name\": \"印数\",\n" +
                "\t\t\t\t\"value\": \"1\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"component_type\": \"DDAttachment\",\n" +
                "\t\t\t\t\"id\": \"DDAttachment-K243SZ49\",\n" +
                "\t\t\t\t\"name\": \"正文内容\",\n" +
                "\t\t\t\t\"value\": \"[{\\\"uploadSize\\\":24830,\\\"spaceId\\\":1856950597,\\\"fileName\\\":\\\"OA附件(6)(1)(2)(2)(1)(1)(1)(1).docx\\\",\\\"fileSize\\\":13251,\\\"fileType\\\":\\\"docx\\\",\\\"fileId\\\":\\\"9642453104\\\"}]\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"operation_records\": [{\n" +
                "\t\t\t\t\"date\": \"2019-10-31 16:08:44\",\n" +
                "\t\t\t\t\"operation_result\": \"NONE\",\n" +
                "\t\t\t\t\"operation_type\": \"START_PROCESS_INSTANCE\",\n" +
                "\t\t\t\t\"userid\": \"2455434225856653\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"date\": \"2019-10-31 16:08:45\",\n" +
                "\t\t\t\t\"operation_result\": \"NONE\",\n" +
                "\t\t\t\t\"operation_type\": \"NONE\",\n" +
                "\t\t\t\t\"remark\": \"\",\n" +
                "\t\t\t\t\"userid\": \"2455434225856653\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"date\": \"2019-10-31 16:09:19\",\n" +
                "\t\t\t\t\"operation_result\": \"AGREE\",\n" +
                "\t\t\t\t\"operation_type\": \"EXECUTE_TASK_NORMAL\",\n" +
                "\t\t\t\t\"remark\": \"请局办核稿\",\n" +
                "\t\t\t\t\"userid\": \"2811090058800301\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"date\": \"2019-10-31 16:09:37\",\n" +
                "\t\t\t\t\"operation_result\": \"AGREE\",\n" +
                "\t\t\t\t\"operation_type\": \"EXECUTE_TASK_NORMAL\",\n" +
                "\t\t\t\t\"remark\": \"呈钱局、赵局阅示\",\n" +
                "\t\t\t\t\"userid\": \"161210562623413664\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"date\": \"2019-10-31 16:10:07\",\n" +
                "\t\t\t\t\"operation_result\": \"AGREE\",\n" +
                "\t\t\t\t\"operation_type\": \"EXECUTE_TASK_NORMAL\",\n" +
                "\t\t\t\t\"remark\": \"拟同意\",\n" +
                "\t\t\t\t\"userid\": \"031226653126153773\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"date\": \"2019-10-31 16:13:45\",\n" +
                "\t\t\t\t\"operation_result\": \"AGREE\",\n" +
                "\t\t\t\t\"operation_type\": \"EXECUTE_TASK_NORMAL\",\n" +
                "\t\t\t\t\"remark\": \"同意\",\n" +
                "\t\t\t\t\"userid\": \"031928461537738628\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"originator_dept_id\": \"139878981\",\n" +
                "\t\t\"originator_dept_name\": \"卫生监督信息与宣传中心\",\n" +
                "\t\t\"originator_userid\": \"2455434225856653\",\n" +
                "\t\t\"result\": \"agree\",\n" +
                "\t\t\"status\": \"COMPLETED\",\n" +
                "\t\t\"tasks\": [{\n" +
                "\t\t\t\t\"create_time\": \"2019-10-31 16:08:45\",\n" +
                "\t\t\t\t\"finish_time\": \"2019-10-31 16:09:20\",\n" +
                "\t\t\t\t\"task_result\": \"AGREE\",\n" +
                "\t\t\t\t\"task_status\": \"COMPLETED\",\n" +
                "\t\t\t\t\"taskid\": \"62562952069\",\n" +
                "\t\t\t\t\"url\": \"aflow.dingtalk.com?procInsId=e02a92f2-eed2-4205-a569-7cb0df59c03b&taskId=62562952069&businessId=201910311608000447590\",\n" +
                "\t\t\t\t\"userid\": \"2811090058800301\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"create_time\": \"2019-10-31 16:09:20\",\n" +
                "\t\t\t\t\"finish_time\": \"2019-10-31 16:09:37\",\n" +
                "\t\t\t\t\"task_result\": \"AGREE\",\n" +
                "\t\t\t\t\"task_status\": \"COMPLETED\",\n" +
                "\t\t\t\t\"taskid\": \"62571277618\",\n" +
                "\t\t\t\t\"url\": \"aflow.dingtalk.com?procInsId=e02a92f2-eed2-4205-a569-7cb0df59c03b&taskId=62571277618&businessId=201910311608000447590\",\n" +
                "\t\t\t\t\"userid\": \"161210562623413664\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"create_time\": \"2019-10-31 16:09:37\",\n" +
                "\t\t\t\t\"finish_time\": \"2019-10-31 16:10:07\",\n" +
                "\t\t\t\t\"task_result\": \"AGREE\",\n" +
                "\t\t\t\t\"task_status\": \"COMPLETED\",\n" +
                "\t\t\t\t\"taskid\": \"62572618211\",\n" +
                "\t\t\t\t\"url\": \"aflow.dingtalk.com?procInsId=e02a92f2-eed2-4205-a569-7cb0df59c03b&taskId=62572618211&businessId=201910311608000447590\",\n" +
                "\t\t\t\t\"userid\": \"031226653126153773\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"create_time\": \"2019-10-31 16:10:07\",\n" +
                "\t\t\t\t\"finish_time\": \"2019-10-31 16:13:46\",\n" +
                "\t\t\t\t\"task_result\": \"AGREE\",\n" +
                "\t\t\t\t\"task_status\": \"COMPLETED\",\n" +
                "\t\t\t\t\"taskid\": \"62580791489\",\n" +
                "\t\t\t\t\"url\": \"aflow.dingtalk.com?procInsId=e02a92f2-eed2-4205-a569-7cb0df59c03b&taskId=62580791489&businessId=201910311608000447590\",\n" +
                "\t\t\t\t\"userid\": \"031928461537738628\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"title\": \"李进提交的发文\"\n" +
                "\t},\n" +
                "\t\"request_id\": \"107a1agx3plan\"\n" +
                "}";
        JsonUtil jsonUtil=new JsonUtil();
        jsonUtil.json2(json);
    }
}
