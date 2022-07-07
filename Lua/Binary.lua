local function to_decimal(num)
    local res = 0
    for i=1,#num do
        if num:sub(i,i) ~= '0' and num:sub(i,i) ~= '1' then
            return 0
        end
        res = res * 2 + tonumber(num:sub(i,i))
    end
    return res
end

return { to_decimal = to_decimal }