public class PromptBank {

		String [] questions;
		
		String [] statements;
		
		public PromptBank(){
			
			questions = new String [21]; 
			
			statements = new String [13];	
			
		}

		public void populateStatementsArray(String firstWord, String lastWord, String name){
			
			statements[0] = name + ", tell me more about " + firstWord + " and " + lastWord + ".";
			
			statements[1] = firstWord + " seems important to you, so does " + lastWord + ". Please tell me more, " + name + ".";
			
			statements[2] = firstWord + " and " + lastWord + " seem to be on your mind. Let's talk about it, " + name + ".";
			
			statements[3] = name + ", I understand how you feel about " + firstWord + " and " + lastWord + ". Tell me more.";

			statements[4] = firstWord + " sounds interesting, " + name + ". Tell me more about " + lastWord + ".";
			
			statements[5] = "It seems you're hiding something about " + firstWord + " and " + lastWord + ". Let's dive a little deeper, " + name + ".";
			
			statements[6] = "Please clarify what you mean by " + firstWord + " and " + lastWord + ", " + name + ". You're doing great.";
			
			statements[7] = firstWord + " and " + lastWord + " appear to be clouding your judgement, " + name + ". Try rephrasing that with less conviction."; 
			
			statements[8] = name + ", please elaborate more on " + firstWord + " and " + lastWord + ".";
			
			statements[9] = name + ", I notice your change in tone when you mentioned " + firstWord + " and " + lastWord + ". Keep going.";
			
			statements[10] = name + ", continue your thoughts under the focus of " + firstWord + " and " + lastWord + ". I'd love to hear more.";

			statements [11] = name + ", you're holding back your emotions on " + firstWord + " and " + lastWord + ". Say it again with more sincerity.";
			
			statements [12] = "My code is liarproof, " + name + ". Tell me the truth about " + firstWord + " and " + lastWord + ".";
					
		}
		
		public void populateQuestionsArray(String firstWord, String lastWord, String name){
			
			questions[0] = name + ", is there anything else about " + firstWord + " and " + lastWord + "?";
			
			questions[1] = name + ", does " + firstWord + " bother you? How about " + lastWord + "?";
			
			questions[2] = "Are " + firstWord + " and " + lastWord + " things you think about often, " + name + "?";
			
			questions[3] = "I understand how you feel about " + firstWord + ", " + name + ". Can you tell me more about " + lastWord + "?";
			
			questions[4] = name + ", how do you react to " + firstWord + " and " + lastWord + "?";
			
			questions[5] = name + ", is it possible that " + firstWord + " and " + lastWord + " are connected?";
			
			questions[6] = name + ", do you think " + firstWord + " is caused by " + lastWord + "?";
			
			questions[7] = "What are your usual reactions to " + firstWord + ", " + name + "? Do you feel the same way about " + lastWord + "?";

			questions[8] = name + ", have you ever told anyone about" + firstWord + " and " + lastWord + "? If so, has it helped in any way?";
			
			questions[9] = name + ", when was the last time " + firstWord + " happened? How about " + lastWord + "?";
			
			questions[10] = "How often do you think about " + firstWord + " and " + lastWord + ", " + name + "?";

			questions[11] = firstWord + " and " + lastWord + " seem to be a guise, " + name + ". What do you really want to speak about?";

			questions [12] = "What's the truth behind " + firstWord + " and " + lastWord + ", " + name + "?";
			
			questions [13] = name + ", what's the first thing that comes to mind when you think of " + firstWord + " and " + lastWord + "?";
			
			questions [14] = name + ", how does " + firstWord + " and " + lastWord + " impact you today?";
			
			questions [15] = "Who can you usually go to about " + firstWord + " and " + lastWord + ", " + name + "?";
			
			questions [16] = "What memories do " + firstWord + " and " + lastWord + " bring up, " + name + "?";
			
			questions [17] = "How can " + firstWord + " and " + lastWord + " help you in the future?";
			
			questions [18] = "What did you learn from " + firstWord + " and " + lastWord + "?";
			
			questions [19] = "Is it possible that " + firstWord + " and " + lastWord + " are things you repress?";
			
			questions [20] = "Does " + firstWord + " and " + lastWord + "appear to be a reoccuring factor in your life, " + name + "?";

		}

		public String getRandomStatementTrunk(int statementNum){
			
			return statements [statementNum];
			
		}

		public String getRandomQuestionTrunk(int questionNum){
		
			return questions [questionNum];
			
		}
		
}
