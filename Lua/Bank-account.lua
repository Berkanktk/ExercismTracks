local BankAccount = {}
    
BankAccount.new = function(self)
	local money = 0
	local is_closed = false
    local account = {}
        
	local ask_if_closed = function()
        if is_closed then
			error("Your account is closed.")
        end
    end

-- Functions
    account.balance = function(self)
        ask_if_closed()
		return money
    end
    
	account.deposit = function(self, amount)
		ask_if_closed()
        if amount <= 0 then
			error("You can't deposit this amount.")
        end
		money = money + amount
    end
    
	account.withdraw = function(self, amount)
		ask_if_closed()
        if amount <= 0 or amount > money then
			error("You can't withdraw this amount.")
        end
		money = money - amount
    end
    
	account.close = function(self)
		is_closed = true
    end     
    
    return account
end

return BankAccount